/*(C) 2007-2012 Alibaba Group Holding Limited.	

import com.taobao.tddl.common.config.ConfigDataListener;

public interface DbPasswdManager {
	
	/**��ȡ���ݿ�����
	 * @return
	 */
	public String getPasswd();
	
	/**ע��Ӧ�����ü���
	 * 
	 * @param Listener
	 */
	public void registerPasswdConfListener(ConfigDataListener Listener);
	
	/**
	 * ֹͣDbPasswdManager
	 */
	public void stopDbPasswdManager();
}