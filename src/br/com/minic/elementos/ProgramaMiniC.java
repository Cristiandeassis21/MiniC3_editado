package br.com.minic.elementos;

import java.util.List;

public class ProgramaMiniC {
	
	//Atributos
	
	private List<DeclaracaoInclude> declaracoesInclude;
	
	//Construtor
	
	public ProgramaMiniC(List<DeclaracaoInclude> declaracoesInclude){
		this.declaracoesInclude = declaracoesInclude;
		
	}
	
	//Metodos
	
	public List<DeclaracaoInclude> getDeclaracoesInclude() {
		return declaracoesInclude;
	}

	public void setDeclaracoesInclude(List<DeclaracaoInclude> declaracoesInclude) {
		this.declaracoesInclude = declaracoesInclude;
	}
	
	@Override
	public String toString() {
		
		StringBuilder impressao = new StringBuilder();
		
		if(this.declaracoesInclude != null){
			for(DeclaracaoInclude declaracoesInclude: this.declaracoesInclude){
				impressao.append(declaracoesInclude.toString());
				impressao.append("\n");
			} 
			//Includes
		}
		return impressao.toString();
	}	
	

}
