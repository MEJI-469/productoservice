package com.sistemafact.productoservice.model;

import jakarta.persistence.*;

    @Entity
    @Table(name = "usuario_roles")
    public class UsuarioRol {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @ManyToOne
        @JoinColumn(name = "id_usuario")
        private Usuario usuario;

        @ManyToOne
        @JoinColumn(name = "id_rol")
        private Rol rol;

        // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}