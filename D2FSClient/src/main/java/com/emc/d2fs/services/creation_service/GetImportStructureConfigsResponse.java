
package com.emc.d2fs.services.creation_service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.emc.d2fs.models.structure.ImportStructureConfig;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.emc.com/d2fs/models/structure}import_structure_configs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importStructureConfigs"
})
@XmlRootElement(name = "getImportStructureConfigsResponse")
public class GetImportStructureConfigsResponse {

    @XmlElement(name = "import_structure_configs", namespace = "http://www.emc.com/d2fs/models/structure")
    protected List<ImportStructureConfig> importStructureConfigs;

    /**
     * Gets the value of the importStructureConfigs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importStructureConfigs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportStructureConfigs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportStructureConfig }
     * 
     * 
     */
    public List<ImportStructureConfig> getImportStructureConfigs() {
        if (importStructureConfigs == null) {
            importStructureConfigs = new ArrayList<ImportStructureConfig>();
        }
        return this.importStructureConfigs;
    }

}
