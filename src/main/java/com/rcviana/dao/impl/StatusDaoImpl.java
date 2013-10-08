package com.rcviana.dao.impl;

import com.rcviana.dao.StatusDao;
import com.rcviana.qualifier.StatusQualifierDb;

/**
 * 
 * @author Robson Viana
 *
 */
@StatusQualifierDb
public class StatusDaoImpl implements StatusDao {

	public String getStatusDB() {
		return " 123...";
	}
}
