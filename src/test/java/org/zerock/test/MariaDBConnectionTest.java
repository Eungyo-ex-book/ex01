package org.zerock.test;

import org.junit.Test;
import org.zerock.web.MariaDBConnection;

import static org.junit.Assert.*;

public class MariaDBConnectionTest {

	@Test
	public void testDBConnection() throws Exception {
		MariaDBConnection ts = new MariaDBConnection();
		ts.testConnection();
	}
}
