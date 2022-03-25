package br.com.spring.fastlog.api.exception;

import java.time.OffsetDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Problema {

	private Integer status;
	private OffsetDateTime dataHora;
	private String titulo;
	private List<Campo> campos;

	@Getter
	@Setter
	@AllArgsConstructor
	public static class Campo {

		private String campo;
		private String mensagem;

	}

}
