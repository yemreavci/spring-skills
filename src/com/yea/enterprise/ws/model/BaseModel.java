package com.yea.enterprise.ws.model;

import java.io.Serializable;
import java.util.Objects;

public class BaseModel implements Serializable {

	private static final long serialVersionUID = 1102956017435683211L;

	@Override
	public boolean equals(Object obj) {
		if (this == null) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		BaseModel other = (BaseModel) obj;

		if (getId() == null || other.getId() == null) {
			return false;
		}

		return Objects.equals(getId(), other.getId());
	}

	private Long getId() {
		return null;
	}

}
