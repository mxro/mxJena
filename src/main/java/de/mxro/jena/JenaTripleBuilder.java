package de.mxro.jena;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Resource;

public interface JenaTripleBuilder {
	public boolean writeTriples(OntModel toModel, Resource parent, de.mxro.filesystem.Folder files);
}
