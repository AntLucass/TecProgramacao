package prova1;

public abstract class PecasDoJogo implements Verificar {
	
	private int id;
	protected String nome;
	protected int coordenadaX;
	protected int coordenadaY;
	protected Plano plano;
	protected char caractere;
	protected int pontuacao;
	protected boolean visibilidade;

	public PecasDoJogo(int id, Plano plano) {
		this.setId(id);
		this.plano = plano;
	}
	
	
	public void introduzirPecaaCelula() {
		for (Celula celula : plano.listaDeCelulas) {
			if(celula.YdaCelula == this.coordenadaY &&
			    celula.XdaCelula == this.coordenadaX) {
				
				celula.pecasDoJogo.add(this);
			}else {
				celula.pecasDoJogo.remove(this);
			}
		}
	}
	
	
	public Celula CelulaAtualDaPeca() {
		for (Celula celula : plano.listaDeCelulas) {
			if(celula.XdaCelula == coordenadaX &&
			   celula.YdaCelula == coordenadaY) {
				return celula;
			}
		}
		return null;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
