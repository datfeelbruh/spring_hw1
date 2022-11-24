package org.example.importers;

import org.example.serivce.Stock;

public interface Importer {
    void importGood(Stock stock, int count);
}
