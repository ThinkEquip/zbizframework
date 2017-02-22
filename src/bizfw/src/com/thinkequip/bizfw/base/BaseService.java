package com.thinkequip.bizfw.base;

import java.util.List;

public interface BaseService<T> {

	public String save(T t);

	public void delete(String id);

	public void update(T t);

	public T queryById(String id);

	public List<T> queryByFieldAndValue(String field, Object value);

	/**
	 * 检查对象是否为null，如果空则抛出异常--target为空，operation失败
	 * 
	 * @param object
	 *            目标对象
	 * @param target
	 *            异常target
	 * @param operation
	 *            异常operation
	 * @throws BizfwServiceException
	 *             业务异常
	 */
	public void checkObjectNotNull(Object object, String target, String operation) throws BizfwServiceException;

	public BaseDao<T> getBaseDao();
}
