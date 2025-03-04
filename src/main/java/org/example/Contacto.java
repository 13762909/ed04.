package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa un contacto telefonico.
 *
 *
 * @author Juan Francisco Pérez
 * @version 1.0
 */


class Contacto {
    private String name;
    private List<String> phones;



    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     *
     * @return devuelve el nombre del contacto
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return devuelve el telefono del contacto
     */
    public List<String> getPhones() {
        return this.phones;
    }
}