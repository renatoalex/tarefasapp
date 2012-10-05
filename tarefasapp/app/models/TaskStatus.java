package models;

import java.util.HashMap;
import java.util.Map;

public enum TaskStatus {

	PENDING(1, "Pendente"), COMPLETED(2, "Completa"), CANCELED(3, "Cancelada"), DELAYED(
			4, "Atrasada");

	public final Integer id;
	public final String label;

	TaskStatus(Integer id, String label) {
		this.id = id;
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public Integer getId() {
		return id;
	}

	public static Map<String, String> allAsMap() {
		Map<String, String> all = new HashMap<String, String>();
		for (TaskStatus u : TaskStatus.values()) {
			all.put(u.toString(), u.label);
		}
		return all;
	}

	@Override
	public String toString() {
		return this.name();
	}
}