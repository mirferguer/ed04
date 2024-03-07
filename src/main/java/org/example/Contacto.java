package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase contiene dos atributos: el nombre del contacto y un listado
 * de teléfonos asociados a dicho contacto.
 * @version 1.0
 * @since 2024
 * @author Miriam Fernández Guerrero
 */
class Persona {
    private String name;
    private List<String> phones;

    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * método getName que sirve para obtener el nombre de algún contacto
     * @return un objeto de tipo string con el nombre almacenado
     */
    public String getName() {
        return this.name;
    }

    /**
     * método getPhones que sirve para obtener una lista de números de teléfono asociados
     * @return devuelve una lista de números de teléfono almacenados
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}