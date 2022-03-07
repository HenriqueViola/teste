module Churrasco {
	
	Dada a classe Pessoa, que possui os atributos: String nome, String sexo, int idade, boolean vegetariana.
	Faça agora uma classe Churrasco que possua:
	Atributo: qtdCarne(Double)
	Método: veificarConsumo() - Recebe via parâmetro uma pessoa e com isso define a consumação média de carne 
	(quantidade de carne consumida), pessoas de 0 a 3 anos não consomem, vegetarianos também não.
	Pessoas de 4 a 12 anos consomem 1 kilo de carne e de 13 anos em diante, 2 kilos de carne.
	*/

	class Pessoa{
	   
	    public $nome;
	    public $sexo;
	    public $idade;
	    public $vegetariana;
	  
	    public function __construct($nome, $sexo, $idade, $vegetariana){
	        $this->nome=$nome;
	        $this->sexo=$sexo;
	        $this->idade=$idade;
	        $this->vegetariana=$vegetariana;
	    }
	}

	class Churrasco{
	    
	    public $qtdCarne=0;
	    
	
	    public function verificarConsumo(Pessoa $p){
	       
	        if($p->idade<4 || $p->vegetariana){
	            $this->qtdCarne +=0; 
	     
	        } elseif ($p->idade > 3 &&  $p->idade < 12){
	            $this->qtdCarne += 1; 
	        
	        } else {
	            $this->qtdCarne = $this->qtdCarne+2; 
	            
	        }
	    }
	}
	
	$g = new Pessoa("Fulano","m",22,false);
	$v = new Pessoa("Ciclano","m",23,false);
	$b = new Pessoa("Beltrano","f",21,true);
	$t = new Pessoa("Fulano2","m",2,false);

	$churrasco = new Churrasco();
	$churrasco->verificarConsumo($g);
	$churrasco->verificarConsumo($v);
	$churrasco->verificarConsumo($b);
	$churrasco->verificarConsumo($t);

	echo("Quantidade de carne do churrasco: ".$churrasTop->qtdCarne);
