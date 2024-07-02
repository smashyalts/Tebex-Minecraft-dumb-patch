package io.tebex.sdk.obj;

import java.util.List;

public interface ICategory {
    int getId();

    int getOrder();

    String getName();


    List<CategoryPackage> getPackages();
}
