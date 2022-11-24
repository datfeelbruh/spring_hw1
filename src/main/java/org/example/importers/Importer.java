package org.example.importers;

import org.example.goods.Good;

import java.util.List;
import java.util.Map;

public interface Importer {
    Map<String, List<Good>> importGood(int count);
}
