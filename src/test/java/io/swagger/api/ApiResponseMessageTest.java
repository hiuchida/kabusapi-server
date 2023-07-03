package io.swagger.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ApiResponseMessageTest {

	@Test
	public void apiResponseMessageTest1() throws Exception {
		ApiResponseMessage arm = new ApiResponseMessage(ApiResponseMessage.ERROR, "");
		assertEquals("error", arm.getType());
	}

	@Test
	public void apiResponseMessageTest2() throws Exception {
		ApiResponseMessage arm = new ApiResponseMessage(ApiResponseMessage.WARNING, "");
		assertEquals("warning", arm.getType());
	}

	@Test
	public void apiResponseMessageTest3() throws Exception {
		ApiResponseMessage arm = new ApiResponseMessage(ApiResponseMessage.INFO, "");
		assertEquals("info", arm.getType());
	}

	@Test
	public void apiResponseMessageTest4() throws Exception {
		ApiResponseMessage arm = new ApiResponseMessage(ApiResponseMessage.OK, "");
		assertEquals("ok", arm.getType());
	}

	@Test
	public void apiResponseMessageTest5() throws Exception {
		ApiResponseMessage arm = new ApiResponseMessage(ApiResponseMessage.TOO_BUSY, "");
		assertEquals("too busy", arm.getType());
	}

	@Test
	public void apiResponseMessageTest0() throws Exception {
		ApiResponseMessage arm = new ApiResponseMessage(0, "");
		assertEquals("unknown", arm.getType());
	}

}
