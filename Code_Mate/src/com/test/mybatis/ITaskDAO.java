/*=======================
 *   IMemberDAO.java
 *   - 인터페이스
 ======================*/

package com.test.mybatis;

import java.util.ArrayList;

public interface ITaskDAO
{
	public ArrayList<TaskDTO> list(String cp_code);
	public String getWriter(String ma_code);
}