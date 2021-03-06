/*
 * A Java client library to interact with the Sugar CRM REST API.
 * Copyright (C) 2013-2014 Tim Stephenson (tim@knowprocess.com)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.knowprocess.sugarcrm.api;

public class SugarException extends RuntimeException {

	private static final long serialVersionUID = -6622157312720254155L;

	public SugarException() {
		super();
	}

	public SugarException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public SugarException(String arg0) {
		super(arg0);
	}

	public SugarException(Throwable arg0) {
		super(arg0);
	}

}
