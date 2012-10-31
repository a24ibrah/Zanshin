package it.unitn.disi.zanshin.services;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface IModelManagementService {
	/** File extension for requirements models. */
	String MODEL_FILE_EXTENSION = "ecore"; //$NON-NLS-1$

	/** TODO: document this field. */
	String GENMODEL_FILE_EXTENSION = "genmodel"; //$NON-NLS-1$

	/** TODO: document this field. */
	String DEFAULT_BASE_PACKAGE = "it.unitn.disi.zanshin.model"; //$NON-NLS-1$

	/** Name of the project sub-directory that will hold the project's models. */
	String MODELS_PROJECT_SUBDIR = "model"; //$NON-NLS-1$

	/** Name of the project sub-directory that will hold the project's source code files. */
	String SOURCES_PROJECT_SUBDIR = "src"; //$NON-NLS-1$

	/** Name of the project sub-directory that will hold the project's compiled classes. */
	String CLASSES_PROJECT_SUBDIR = "bin"; //$NON-NLS-1$

	/** List of names of sub-directories that should exist/be created for every project. */
	String[] PROJECT_SUBDIRS = new String[] { MODELS_PROJECT_SUBDIR, SOURCES_PROJECT_SUBDIR, CLASSES_PROJECT_SUBDIR };

	/**
	 * TODO: document this method.
	 * 
	 * @param projectName
	 * @return
	 * @throws CoreException
	 * @throws IOException 
	 */
	IProject createModelProject(String projectName) throws CoreException, IOException;

	/**
	 * TODO: document this method.
	 * 
	 * @param project
	 * @param modelName
	 * @param contents
	 * @return
	 * @throws CoreException
	 */
	IFile createModel(IProject project, String modelName, String contents) throws CoreException;

	/**
	 * TODO: document this method.
	 * 
	 * @param modelFile
	 * @return
	 * @throws IOException
	 * @throws CoreException
	 */
	Resource readModel(IFile modelFile) throws IOException, CoreException;

	/**
	 * TODO: document this method.
	 * 
	 * @param modelFile
	 * @param basePackage
	 * @return
	 * @throws IOException
	 * @throws CoreException
	 */
	Resource createGenModelFile(IFile modelFile, String basePackage) throws IOException, CoreException;

	/**
	 * TODO: document this method.
	 * 
	 * @param genModelResource
	 */
	void generateClasses(Resource genModelResource);

	/**
	 * TODO: document this method.
	 * 
	 * @param project
	 * @throws CoreException
	 */
	void compileClasses(IProject project) throws CoreException;
}
