package com.example.demo;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "alumno")
	public class Alumno {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY )
			private Integer id_alumno;
			private String nombre;
			private String direccion;
			private String edad;
			public Integer getId_alumno() {
				return id_alumno;
				
	
}
			public String getNombre() {
				return nombre;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public String getDireccion() {
				return direccion;
			}
			public void setDireccion(String direccion) {
				this.direccion = direccion;
			}
			public String getEdad() {
				return edad;
			}
			public void setEdad(String edad) {
				this.edad = edad;
			}
			public void setId_alumno(Integer id_alumno) {
				this.id_alumno = id_alumno;
			}
			@Override
			public String toString() {
				return "Alumno [id_alumno=" + id_alumno + ", nombre=" + nombre + ", direccion=" + direccion + ", edad="
						+ edad + "]";
			}
			
	}
			
			
