package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * contiene una lista de contactos y métodos para añadir nuevos contactos,
 * eliminar contactos existentes dentro de la lista de contactos y
 * modificar el número de teléfono de un contacto concreto.
 * @version 1.0
 * @since 2024
 * @author Miriam Fernández Guerrero
 */
public class Agenda {
    private List<Contacto> contacts; // Lista de Contacto

    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Este método modifica la lista de contactos.
     * Método que sirve para agregar un nuevo contacto a una lista de contactos.
     * Comprueba si el contacto ya existe en la lista de contactos.
     * Si el contacto existe, agrega el número de teléfono proporcionado al contacto existente.
     * Si el contacto no existe, crea un nuevo contacto con el nombre y número de teléfono
     * proporcionados y lo agrega a la lista de contactos.
     * @param name Nombre del contacto
     * @param phone Teléfono del contacto.
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
     * Método para eliminar un contacto de la lista de contactos según el nombre proporcionado.
     * @param name Nombre del contacto.
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
     * Método para modificar el número de teléfono de un contacto específico en la lista de
     * contactos según el nombre proporcionado.
     * @param name Nombre del contacto
     * @param oldPhone Teléfono antiguo del contacto.
     * @param newPhone Teléfono actualizado del contacto.
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
     * Método que devuelve la lista de contactos almacenada en el objeto actual.
     * @return lista de contactos asociados al objeto al que se llama el método.
     */

    public List<Contacto> getContacts() {
        return this.contacts;
    }
}