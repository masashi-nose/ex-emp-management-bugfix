package jp.co.sample.emp_management.form;

import javax.validation.constraints.NotBlank;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@NotBlank(message = "名前の入力は必須です。")
	private String name;

	/** メールアドレス */
	@NotBlank(message = "メールアドレスの入力は必須です。")
	private String mailAddress;

	/** パスワード */
	@NotBlank(message = "パスワードの入力は必須です。")
	private String password;

	/** 再パスワード */
	@NotBlank(message = "パスワードを再度入力してください。")
	private String rePassword;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRePassword() {
		return rePassword;
	}

	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ ", rePassword=" + rePassword + "]";
	}

}
