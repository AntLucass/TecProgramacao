package controlador;

public class Emprestimo {

	private Pessoa cliente;
	private Publicacao publicacao;

	public Emprestimo(Pessoa cliente, Publicacao publicacao) {
		this.cliente = cliente;
		this.publicacao = publicacao;
		this.cliente.tps += cliente.pagamentotp();
	}
	
	

	public float descontoAluno() {
		
		if(this.cliente.tipo == "Aluno") {
			
		if(this.publicacao.tipo == "Livro")
		{this.cliente.tps = (float) (this.cliente.tps - this.cliente.tps * 0.1);}
		else
			if(this.publicacao.tipo == "Revista")
			{this.cliente.tps = (float) (this.cliente.tps - this.cliente.tps * 0.01);}
			else
				if(this.publicacao.tipo == "Artigo")
			    {this.cliente.tps = (float) (this.cliente.tps - this.cliente.tps * 0.5);}
		
		return this.cliente.tps;}
		return this.cliente.tps;
		
	}
	

   public boolean quantidadepublicacoes() {
		
	if(this.publicacao.quantidadeDisponivel  > 0) {
		this.publicacao.quantidadeDisponivel = this.publicacao.quantidadeDisponivel - 1;
		return true;
	}else 
	{
	    return false;}
	
}
   
   public boolean publicacoesdocliente() {
		
		if(this.cliente.numdepublicacoes  < this.cliente.maxPublicacoes()) {
			this.cliente.numdepublicacoes = this.cliente.numdepublicacoes + 1;
			return true;
		}else 
		{
		    return false;}
		
	}
	
	
	
	public String retornarDadosEmprestimo() {
		
        if(quantidadepublicacoes() == true) {
        	if(publicacoesdocliente() == true) {
		String saida = "";
		saida = this.cliente.tipo+":" + this.cliente.nome + " - " + publicacao.tipo + ": " + this.publicacao.titulo
				+ " - Dias de emprestimo: " + cliente.verificarDias() + " - TPs: " + this.descontoAluno();
		return saida;}
        	else {
            	String saida = "Usuario com numero maximo de publicacoes";
            return saida; 
            }}
        else {
        	String saida = "Publicacao Indisponivel";
        return saida; 
        }
        
	}
}
