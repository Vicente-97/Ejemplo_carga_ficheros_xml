package xml.model;

public class Coche { //POJO

	private int id;
	private String modelo;
	private String marca;
	private String motor;
	
	public Coche() {
	
	}

	public Coche(int id, String modelo, String marca, String motor) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.motor = motor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Coche [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", motor=" + motor + "]";
	}
	
	
	
}
