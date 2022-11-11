package org.ieschabas.unidad3;

public class perro {
	
	private String raza;
	private String colorPelaje;
	private String colorOjos;
	private String sexo;

	public perro (){
	}
	public perro (String raza, String colorPelaje, String colorOjos, String sexo) {
		raza = this.raza;
		colorPelaje = this.colorPelaje;
		colorOjos = this.colorOjos;
		sexo = this.sexo;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}

	public void setColorPelaje(String colorPelaje) {
		this.colorPelaje = colorPelaje;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getColorOjos() {
		return colorOjos;
	}

	public String getColorPelaje() {
		return colorPelaje;
	}

	public String getRaza() {
		return raza;
	}

	public String getSexo() {
		return sexo;

	}
}
