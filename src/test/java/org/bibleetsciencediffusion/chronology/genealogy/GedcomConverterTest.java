package org.bibleetsciencediffusion.chronology.genealogy;

import org.gedcomx.tools.Gedcom2Gedcomx;
import org.junit.Test;

public class GedcomConverterTest {
    @Test
    public void testConvertXML() throws Exception {
        Gedcom2Gedcomx.main(new String[]{"-i", "C:\\Users\\frup43047\\Projects\\github.com\\BibleEtScienceDiffusion\\GenealogyTools\\src\\main\\resources\\genealogies\\Bible_Genealogy_v1_0.ged", "-o", "C:\\Users\\frup43047\\Projects\\github.com\\BibleEtScienceDiffusion\\GenealogyTools\\src\\main\\resources\\genealogies\\Bible_Genealogy_v1_0.gedx", "-v"});
    }

    @Test
    public void testConvertJS() throws Exception {
        Gedcom2Gedcomx.main(new String[]{"-i", "C:\\Users\\frup43047\\Projects\\github.com\\BibleEtScienceDiffusion\\GenealogyTools\\src\\main\\resources\\genealogies\\Bible_Genealogy_v1_0.ged", "-o", "C:\\Users\\frup43047\\Projects\\github.com\\BibleEtScienceDiffusion\\GenealogyTools\\src\\main\\resources\\genealogies\\Bible_Genealogy_v1_0.json", "-js", "-v"});
    }
}
