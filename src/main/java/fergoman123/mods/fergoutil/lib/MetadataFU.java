package fergoman123.mods.fergoutil.lib;

import cpw.mods.fml.common.ModMetadata;

public class MetadataFU{

    public static void writeMetadata(ModMetadata metadata)
    {
        metadata.autogenerated = ModInfo.autoGenerated;
        metadata.modId = ModInfo.modid;
        metadata.name = ModInfo.name;
        metadata.version = ModInfo.version;
        metadata.logoFile = ModInfo.logoFile;
        metadata.authorList = ModInfo.authorList;
        metadata.url = ModInfo.url;
        metadata.description = ModInfo.desc;
    }
}
