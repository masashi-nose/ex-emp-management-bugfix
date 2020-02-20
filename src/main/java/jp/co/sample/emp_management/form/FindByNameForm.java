package jp.co.sample.emp_management.form;

/**
 * 従業員リストから名前の曖昧検索をした際に生成されるリクエストパラメータを受け取るフォーム.
 * 
 * @author masashi.nose
 *
 */
public class FindByNameForm {

	/** 名前 */
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "FindByNameForm [name=" + name + "]";
	}

}
