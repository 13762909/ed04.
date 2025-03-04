package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *Esta clase representa una agenda telefonica.
 *
 * @author Juan Francisco
 * @version 1.0
 * @since 04/03/2025
 *
 */

public class Agenda {
    private List<Contacto> contacts; // Lista de Contacto

    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Este metodo añade un contacto
     * @param name ,  nombre de contacto
     * @param phone , telefono del contacto
     *
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Este metodo elimina un contacto
     * @param name , nombre de contacto
     *
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Este metodo modifica un numero de telefono del contacto
     * @param name, nombre contacto
     * @param oldPhone , telefono antiguo
     * @param newPhone , telefono nuevo
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * @Contacto , contacto que queremos que nos devuelva la informacion
     * @return , devulve la informacion del contacto
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}