package org.northcoders.missions;

import java.util.UUID;

public class Mission {
    private UUID uuid;
    private String codename;

    public Mission (String codename) {
        this.uuid = UUID.randomUUID();
        setCodename(codename);
    }

    private void setCodename(String codename) {
        this.codename = codename;
    }

}
