package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
    import cronapi.CronapiCloud;


/**
* Classe que representa a tabela ESCUDERIA
* @generated
*/
@Entity
@Table(name = "\"ESCUDERIA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Escuderia")
public class Escuderia implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;

    /**
    * @generated
    */
    @Column(name = "carro", nullable = true, unique = false, insertable=true, updatable=true)
    @CronapiCloud(type = "dropbox", value="iaHJo-pLh7IAAAAAAAAAAcMy04m5KjRA8Sgh1vX0oDcVro6y02MELcFf8chsqGul", id="", secret="")
        
        private java.lang.String carro;

    /**
    * Construtor
    * @generated
    */
    public Escuderia(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Escuderia setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    
    public java.lang.String getNome(){
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Escuderia setNome(java.lang.String nome){
        this.nome = nome;
        return this;
    }
    /**
    * Obtém carro
    * return carro
    * @generated
    */
    
    public java.lang.String getCarro(){
        return this.carro;
    }

    /**
    * Define carro
    * @param carro carro
    * @generated
    */
    public Escuderia setCarro(java.lang.String carro){
        this.carro = carro;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Escuderia object = (Escuderia)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}