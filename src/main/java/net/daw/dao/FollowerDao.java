/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.dao;

import net.daw.bean.FollowerBean;
import net.daw.helper.Conexion;

/**
 *
 * @author Jordi
 */
public class FollowerDao extends GenericDaoImplementation<FollowerBean> {

    public FollowerDao() throws Exception {
        super( "follower");
    }

}
