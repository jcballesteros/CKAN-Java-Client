package org.ckan;

import java.net.URI;
import java.util.Date;
import java.util.Map;

/**
 * Represents a CKAN group
 *
 * @author      Ross Jones <ross.jones@okfn.org>
 * @version     1.7
 * @since       2012-05-01
 */
public final class Group extends CKANObject {

    public String id;
    public String name;
    public String title;
    public String type;
    public String description;
    public URI    image_url;
    public Date   created;
    public String approval_status;
    public Map<String,String> extras;

    /**
    * Once the obvious string fields have been processed, the lists and dicts
    * need to be parsed, but these are specific to the object processing them
    * and so it is given a chance to grab those extra fields
    *
    * @param key The key from the original JSON
    * @param value Normally either a list or a dict of some form
    */
    public void PickField( String key, Object value ) {

    }

}






