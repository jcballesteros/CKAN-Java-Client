package org.ckan;

import java.util.Date;

/**
 * Represents a CKAN User
 *
 * @author      Ross Jones <ross.jones@okfn.org>
 * @version     1.7
 * @since       2012-05-01
 */
public final class User extends CKANObject {

    public String id;
    public String name;
    public String fullname;
    public String email;
    public Date   created;
    public String about;

    /**
    * Once the obvious string fields have been processed, the lists and dicts
    * need to be parsed, but these are specific to the object processing them
    * and so it is given a chance to grab those extra fields
    *
    * @param key The key from the original JSON
    * @param value Normally either a list or a dict of some form
    */
    public void PickField( String key, Object value ) {
        // NOOP
    }

}






