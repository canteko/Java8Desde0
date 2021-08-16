package tratardatos;

class Persona {
    // Estructura, conocida como propiedades o atributos
    String nombre;
    String apellidos;
    int edad;
    int altura;
    float peso;

    // Constructor con parametros
    public Persona(String name, String appellidos, int edad, int altura, float peso) {
        this.nombre = name;
        this.apellidos = appellidos;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    // Constructor vacio
    public Persona() {
        this("John", "Doe", 50, 180, 80.0f);
    }

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public int getAltura() {
		return altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	// Comportamiento, conocido como metodos
    void caminar() {
        System.out.println("Estoy caminando");
    }
    void hablar() {
        System.out.println("Estoy hablando");
    }
    void nacer() {
        System.out.println("¡¡Acabo de nacer!!");
    }
    void morir() {
        System.out.println("Me muero");
    }

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}
}