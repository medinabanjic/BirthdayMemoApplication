package ba.bitcamp.project.birthdayMemo;

import java.io.File;

public class Files {

	private File users = null;

	private File active = null;

	public Files() {
		this.users = new File("src/ba/bitcamp/project/birthdayMemo/users");
		this.active = new File("src/ba/bitcamp/project/birthdayMemo/active");
	}

	public File getUsers() {
		return users;
	}

	public void setUsers(File users) {
		this.users = users;
	}

	public File getActive() {
		return active;
	}

	public void setActive(File active) {
		this.active = active;
	}

}
