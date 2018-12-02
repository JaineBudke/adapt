package br.com.adapt.framework.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.adapt.framework.model.Resource;


/**
 * Interface responsável por definir o modo de compartilhamento
 * do cronograma
 * @author mayra
 *
 */
public interface SharedSchedule<T extends Resource> {
	
	public void export(List<T> resources, HttpServletRequest request, HttpServletResponse response) throws Exception;
}
