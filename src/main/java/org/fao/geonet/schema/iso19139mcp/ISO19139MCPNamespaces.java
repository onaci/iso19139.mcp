package org.fao.geonet.schema.iso19139mcp;

import org.jdom.Namespace;

/**
 * Namespaces for iso19139.mcp metadata standard.
 */
public class ISO19139MCPNamespaces {
    public static final Namespace MCP =
            Namespace.getNamespace("mcp", "http://bluenet3.antcrc.utas.edu.au/mcp");
    public static final Namespace GCO =
            Namespace.getNamespace("gco", "http://www.isotc211.org/2005/gco");
    public static final Namespace SRV =
            Namespace.getNamespace("srv", "http://www.isotc211.org/2005/srv");
    public static final Namespace GMD =
            Namespace.getNamespace("gmd", "http://www.isotc211.org/2005/gmd");
    public static final Namespace GMX =
            Namespace.getNamespace("gmx", "http://www.isotc211.org/2005/gmx");
}
