/*-
 * ========================LICENSE_START=================================
 * TeamApps FileType Icon Provider
 * ---
 * Copyright (C) 2024 TeamApps.org
 * ---
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */
package org.teamapps.icon.filetype;

import org.teamapps.icons.Icon;
import org.teamapps.icons.spi.IconLibrary;

import java.util.*;
import java.util.stream.Collectors;

@IconLibrary(
        name = "fileType",
        encoder = FileTypeIconEncoder.class,
        decoder = FileTypeIconDecoder.class,
        loader = FileTypeIconLoader.class,
        defaultStyleSupplier = FileTypeIconDefaultIconSupplier.class
)
public class FileTypeIcon implements Icon<FileTypeIcon, FileTypeIconStyle> {

    private static final Map<String, FileTypeIcon> ICONS_BY_ID_SIMPLE = new HashMap<>();
    private static final Map<String, FileTypeIcon> ICONS_BY_ID_DETAIL = new HashMap<>();
    private final String iconId;
    private final FileTypeIconStyle style;
    private final String iconPath;

    private FileTypeIcon(String iconId, String iconPath, FileTypeIconStyle style) {
        this.iconId = iconId;
        this.iconPath = iconPath;
        this.style = Objects.requireNonNullElse(style, FileTypeIconStyle.SIMPLE);
    }

    public static FileTypeIcon forId(String iconId) {
        return forId(iconId, FileTypeIconStyle.SIMPLE);
    }
    public static FileTypeIcon forId(String id, FileTypeIconStyle style) {
        if (style == null || FileTypeIconStyle.SIMPLE.equals(style)) {
            return ICONS_BY_ID_SIMPLE.get(id);
        } else {
            return ICONS_BY_ID_DETAIL.get(id);
        }
    }

    public static List<FileTypeIcon> getIcons() {
        return ICONS_BY_ID_SIMPLE.values().stream()
                .sorted(Comparator.comparing(FileTypeIcon::getIconId))
                .collect(Collectors.toList());
    }

    @Override
    public FileTypeIcon withStyle(FileTypeIconStyle fileTypeIconStyle) {
        return forId(iconId, fileTypeIconStyle);
    }

    @Override
    public FileTypeIconStyle getStyle() {
        return style;
    }

    public String getIconId() {
        return iconId;
    }

    public String getIconPath() {
        return iconPath;
    }

    private static FileTypeIcon create(String id, String path) {
        FileTypeIcon icon = new FileTypeIcon(id, path, null);
        ICONS_BY_ID_SIMPLE.put(id, icon);
        FileTypeIcon detailIcon = new FileTypeIcon(id, path, FileTypeIconStyle.DETAIL);
        ICONS_BY_ID_DETAIL.put(id, detailIcon);
        return icon;
    }

    public static final FileTypeIcon N_3G2 = create("3g2", "3g2");
    public static final FileTypeIcon N_3GA = create("3ga", "3ga");
    public static final FileTypeIcon N_3GP = create("3gp", "3gp");
    public static final FileTypeIcon N_7Z = create("7z", "7z");
    public static final FileTypeIcon AA = create("aa", "aa");
    public static final FileTypeIcon AAC = create("aac", "aac");
    public static final FileTypeIcon AC = create("ac", "ac");
    public static final FileTypeIcon ACCDB = create("accdb", "accdb");
    public static final FileTypeIcon ACCDT = create("accdt", "accdt");
    public static final FileTypeIcon ACE = create("ace", "ace");
    public static final FileTypeIcon ADN = create("adn", "adn");
    public static final FileTypeIcon AI = create("ai", "ai");
    public static final FileTypeIcon AIF = create("aif", "aif");
    public static final FileTypeIcon AIFC = create("aifc", "aifc");
    public static final FileTypeIcon AIFF = create("aiff", "aiff");
    public static final FileTypeIcon AIT = create("ait", "ait");
    public static final FileTypeIcon AMR = create("amr", "amr");
    public static final FileTypeIcon ANI = create("ani", "ani");
    public static final FileTypeIcon APK = create("apk", "apk");
    public static final FileTypeIcon APP = create("app", "app");
    public static final FileTypeIcon APPLESCRIPT = create("applescript", "applescript");
    public static final FileTypeIcon ASAX = create("asax", "asax");
    public static final FileTypeIcon ASC = create("asc", "asc");
    public static final FileTypeIcon ASCX = create("ascx", "ascx");
    public static final FileTypeIcon ASF = create("asf", "asf");
    public static final FileTypeIcon ASH = create("ash", "ash");
    public static final FileTypeIcon ASHX = create("ashx", "ashx");
    public static final FileTypeIcon ASM = create("asm", "asm");
    public static final FileTypeIcon ASMX = create("asmx", "asmx");
    public static final FileTypeIcon ASP = create("asp", "asp");
    public static final FileTypeIcon ASPX = create("aspx", "aspx");
    public static final FileTypeIcon ASX = create("asx", "asx");
    public static final FileTypeIcon AU = create("au", "au");
    public static final FileTypeIcon AUP = create("aup", "aup");
    public static final FileTypeIcon AVI = create("avi", "avi");
    public static final FileTypeIcon AXD = create("axd", "axd");
    public static final FileTypeIcon AZE = create("aze", "aze");
    public static final FileTypeIcon BAK = create("bak", "bak");
    public static final FileTypeIcon BASH = create("bash", "bash");
    public static final FileTypeIcon BAT = create("bat", "bat");
    public static final FileTypeIcon BIN = create("bin", "bin");
    public static final FileTypeIcon BLANK = create("blank", "blank");
    public static final FileTypeIcon BMP = create("bmp", "bmp");
    public static final FileTypeIcon BOWERRC = create("bowerrc", "bowerrc");
    public static final FileTypeIcon BPG = create("bpg", "bpg");
    public static final FileTypeIcon BROWSER = create("browser", "browser");
    public static final FileTypeIcon BZ2 = create("bz2", "bz2");
    public static final FileTypeIcon BZEMPTY = create("bzempty", "bzempty");
    public static final FileTypeIcon C = create("c", "c");
    public static final FileTypeIcon CAB = create("cab", "cab");
    public static final FileTypeIcon CAD = create("cad", "cad");
    public static final FileTypeIcon CAF = create("caf", "caf");
    public static final FileTypeIcon CAL = create("cal", "cal");
    public static final FileTypeIcon CD = create("cd", "cd");
    public static final FileTypeIcon CDDA = create("cdda", "cdda");
    public static final FileTypeIcon CER = create("cer", "cer");
    public static final FileTypeIcon CFG = create("cfg", "cfg");
    public static final FileTypeIcon CFM = create("cfm", "cfm");
    public static final FileTypeIcon CFML = create("cfml", "cfml");
    public static final FileTypeIcon CGI = create("cgi", "cgi");
    public static final FileTypeIcon CHM = create("chm", "chm");
    public static final FileTypeIcon CLASS = create("class", "class");
    public static final FileTypeIcon CMD = create("cmd", "cmd");
    public static final FileTypeIcon CODE_WORKSPACE = create("code-workspace", "code-workspace");
    public static final FileTypeIcon CODEKIT = create("codekit", "codekit");
    public static final FileTypeIcon COFFEE = create("coffee", "coffee");
    public static final FileTypeIcon COFFEELINTIGNORE = create("coffeelintignore", "coffeelintignore");
    public static final FileTypeIcon COM = create("com", "com");
    public static final FileTypeIcon COMPILE = create("compile", "compile");
    public static final FileTypeIcon CONF = create("conf", "conf");
    public static final FileTypeIcon CONFIG = create("config", "config");
    public static final FileTypeIcon CPP = create("cpp", "cpp");
    public static final FileTypeIcon CPTX = create("cptx", "cptx");
    public static final FileTypeIcon CR2 = create("cr2", "cr2");
    public static final FileTypeIcon CRDOWNLOAD = create("crdownload", "crdownload");
    public static final FileTypeIcon CRT = create("crt", "crt");
    public static final FileTypeIcon CRYPT = create("crypt", "crypt");
    public static final FileTypeIcon CS = create("cs", "cs");
    public static final FileTypeIcon CSH = create("csh", "csh");
    public static final FileTypeIcon CSON = create("cson", "cson");
    public static final FileTypeIcon CSPROJ = create("csproj", "csproj");
    public static final FileTypeIcon CSS = create("css", "css");
    public static final FileTypeIcon CSV = create("csv", "csv");
    public static final FileTypeIcon CUE = create("cue", "cue");
    public static final FileTypeIcon CUR = create("cur", "cur");
    public static final FileTypeIcon DART = create("dart", "dart");
    public static final FileTypeIcon DAT = create("dat", "dat");
    public static final FileTypeIcon DATA = create("data", "data");
    public static final FileTypeIcon DB = create("db", "db");
    public static final FileTypeIcon DBF = create("dbf", "dbf");
    public static final FileTypeIcon DEB = create("deb", "deb");
    public static final FileTypeIcon DEFAULT = create("default", "default");
    public static final FileTypeIcon DGN = create("dgn", "dgn");
    public static final FileTypeIcon DIST = create("dist", "dist");
    public static final FileTypeIcon DIZ = create("diz", "diz");
    public static final FileTypeIcon DLL = create("dll", "dll");
    public static final FileTypeIcon DMG = create("dmg", "dmg");
    public static final FileTypeIcon DNG = create("dng", "dng");
    public static final FileTypeIcon DOC = create("doc", "doc");
    public static final FileTypeIcon DOCB = create("docb", "docb");
    public static final FileTypeIcon DOCM = create("docm", "docm");
    public static final FileTypeIcon DOCX = create("docx", "docx");
    public static final FileTypeIcon DOT = create("dot", "dot");
    public static final FileTypeIcon DOTM = create("dotm", "dotm");
    public static final FileTypeIcon DOTX = create("dotx", "dotx");
    public static final FileTypeIcon DOWNLOAD = create("download", "download");
    public static final FileTypeIcon DPJ = create("dpj", "dpj");
    public static final FileTypeIcon DS_STORE = create("ds_store", "ds_store");
    public static final FileTypeIcon DSN = create("dsn", "dsn");
    public static final FileTypeIcon DTD = create("dtd", "dtd");
    public static final FileTypeIcon DWG = create("dwg", "dwg");
    public static final FileTypeIcon DXF = create("dxf", "dxf");
    public static final FileTypeIcon EDITORCONFIG = create("editorconfig", "editorconfig");
    public static final FileTypeIcon EL = create("el", "el");
    public static final FileTypeIcon ELF = create("elf", "elf");
    public static final FileTypeIcon EML = create("eml", "eml");
    public static final FileTypeIcon ENC = create("enc", "enc");
    public static final FileTypeIcon EOT = create("eot", "eot");
    public static final FileTypeIcon EPS = create("eps", "eps");
    public static final FileTypeIcon EPUB = create("epub", "epub");
    public static final FileTypeIcon ESLINTIGNORE = create("eslintignore", "eslintignore");
    public static final FileTypeIcon EXE = create("exe", "exe");
    public static final FileTypeIcon F4V = create("f4v", "f4v");
    public static final FileTypeIcon FAX = create("fax", "fax");
    public static final FileTypeIcon FB2 = create("fb2", "fb2");
    public static final FileTypeIcon FLA = create("fla", "fla");
    public static final FileTypeIcon FLAC = create("flac", "flac");
    public static final FileTypeIcon FLV = create("flv", "flv");
    public static final FileTypeIcon FNT = create("fnt", "fnt");
    public static final FileTypeIcon FOLDER = create("folder", "folder");
    public static final FileTypeIcon FON = create("fon", "fon");
    public static final FileTypeIcon GADGET = create("gadget", "gadget");
    public static final FileTypeIcon GDP = create("gdp", "gdp");
    public static final FileTypeIcon GEM = create("gem", "gem");
    public static final FileTypeIcon GIF = create("gif", "gif");
    public static final FileTypeIcon GITATTRIBUTES = create("gitattributes", "gitattributes");
    public static final FileTypeIcon GITIGNORE = create("gitignore", "gitignore");
    public static final FileTypeIcon GO = create("go", "go");
    public static final FileTypeIcon GPG = create("gpg", "gpg");
    public static final FileTypeIcon GPL = create("gpl", "gpl");
    public static final FileTypeIcon GRADLE = create("gradle", "gradle");
    public static final FileTypeIcon GZ = create("gz", "gz");
    public static final FileTypeIcon H = create("h", "h");
    public static final FileTypeIcon HANDLEBARS = create("handlebars", "handlebars");
    public static final FileTypeIcon HBS = create("hbs", "hbs");
    public static final FileTypeIcon HEIC = create("heic", "heic");
    public static final FileTypeIcon HLP = create("hlp", "hlp");
    public static final FileTypeIcon HS = create("hs", "hs");
    public static final FileTypeIcon HSL = create("hsl", "hsl");
    public static final FileTypeIcon HTM = create("htm", "htm");
    public static final FileTypeIcon HTML = create("html", "html");
    public static final FileTypeIcon IBOOKS = create("ibooks", "ibooks");
    public static final FileTypeIcon ICNS = create("icns", "icns");
    public static final FileTypeIcon ICO = create("ico", "ico");
    public static final FileTypeIcon ICS = create("ics", "ics");
    public static final FileTypeIcon IDX = create("idx", "idx");
    public static final FileTypeIcon IFF = create("iff", "iff");
    public static final FileTypeIcon IFO = create("ifo", "ifo");
    public static final FileTypeIcon IMAGE = create("image", "image");
    public static final FileTypeIcon IMG = create("img", "img");
    public static final FileTypeIcon IML = create("iml", "iml");
    public static final FileTypeIcon IN = create("in", "in");
    public static final FileTypeIcon INC = create("inc", "inc");
    public static final FileTypeIcon INDD = create("indd", "indd");
    public static final FileTypeIcon INF = create("inf", "inf");
    public static final FileTypeIcon INFO = create("info", "info");
    public static final FileTypeIcon INI = create("ini", "ini");
    public static final FileTypeIcon INV = create("inv", "inv");
    public static final FileTypeIcon ISO = create("iso", "iso");
    public static final FileTypeIcon J2 = create("j2", "j2");
    public static final FileTypeIcon JAR = create("jar", "jar");
    public static final FileTypeIcon JAVA = create("java", "java");
    public static final FileTypeIcon JPE = create("jpe", "jpe");
    public static final FileTypeIcon JPEG = create("jpeg", "jpeg");
    public static final FileTypeIcon JPG = create("jpg", "jpg");
    public static final FileTypeIcon JS = create("js", "js");
    public static final FileTypeIcon JSON = create("json", "json");
    public static final FileTypeIcon JSP = create("jsp", "jsp");
    public static final FileTypeIcon JSX = create("jsx", "jsx");
    public static final FileTypeIcon KEY = create("key", "key");
    public static final FileTypeIcon KF8 = create("kf8", "kf8");
    public static final FileTypeIcon KMK = create("kmk", "kmk");
    public static final FileTypeIcon KSH = create("ksh", "ksh");
    public static final FileTypeIcon KT = create("kt", "kt");
    public static final FileTypeIcon KTS = create("kts", "kts");
    public static final FileTypeIcon KUP = create("kup", "kup");
    public static final FileTypeIcon LESS = create("less", "less");
    public static final FileTypeIcon LEX = create("lex", "lex");
    public static final FileTypeIcon LICX = create("licx", "licx");
    public static final FileTypeIcon LISP = create("lisp", "lisp");
    public static final FileTypeIcon LIT = create("lit", "lit");
    public static final FileTypeIcon LNK = create("lnk", "lnk");
    public static final FileTypeIcon LOCK = create("lock", "lock");
    public static final FileTypeIcon LOG = create("log", "log");
    public static final FileTypeIcon LUA = create("lua", "lua");
    public static final FileTypeIcon M = create("m", "m");
    public static final FileTypeIcon M2V = create("m2v", "m2v");
    public static final FileTypeIcon M3U = create("m3u", "m3u");
    public static final FileTypeIcon M3U8 = create("m3u8", "m3u8");
    public static final FileTypeIcon M4 = create("m4", "m4");
    public static final FileTypeIcon M4A = create("m4a", "m4a");
    public static final FileTypeIcon M4R = create("m4r", "m4r");
    public static final FileTypeIcon M4V = create("m4v", "m4v");
    public static final FileTypeIcon MAP = create("map", "map");
    public static final FileTypeIcon MASTER = create("master", "master");
    public static final FileTypeIcon MC = create("mc", "mc");
    public static final FileTypeIcon MD = create("md", "md");
    public static final FileTypeIcon MDB = create("mdb", "mdb");
    public static final FileTypeIcon MDF = create("mdf", "mdf");
    public static final FileTypeIcon ME = create("me", "me");
    public static final FileTypeIcon MI = create("mi", "mi");
    public static final FileTypeIcon MID = create("mid", "mid");
    public static final FileTypeIcon MIDI = create("midi", "midi");
    public static final FileTypeIcon MK = create("mk", "mk");
    public static final FileTypeIcon MKV = create("mkv", "mkv");
    public static final FileTypeIcon MM = create("mm", "mm");
    public static final FileTypeIcon MNG = create("mng", "mng");
    public static final FileTypeIcon MO = create("mo", "mo");
    public static final FileTypeIcon MOBI = create("mobi", "mobi");
    public static final FileTypeIcon MOD = create("mod", "mod");
    public static final FileTypeIcon MOV = create("mov", "mov");
    public static final FileTypeIcon MP2 = create("mp2", "mp2");
    public static final FileTypeIcon MP3 = create("mp3", "mp3");
    public static final FileTypeIcon MP4 = create("mp4", "mp4");
    public static final FileTypeIcon MPA = create("mpa", "mpa");
    public static final FileTypeIcon MPD = create("mpd", "mpd");
    public static final FileTypeIcon MPE = create("mpe", "mpe");
    public static final FileTypeIcon MPEG = create("mpeg", "mpeg");
    public static final FileTypeIcon MPG = create("mpg", "mpg");
    public static final FileTypeIcon MPGA = create("mpga", "mpga");
    public static final FileTypeIcon MPP = create("mpp", "mpp");
    public static final FileTypeIcon MPT = create("mpt", "mpt");
    public static final FileTypeIcon MSG = create("msg", "msg");
    public static final FileTypeIcon MSI = create("msi", "msi");
    public static final FileTypeIcon MSU = create("msu", "msu");
    public static final FileTypeIcon NEF = create("nef", "nef");
    public static final FileTypeIcon NES = create("nes", "nes");
    public static final FileTypeIcon NFO = create("nfo", "nfo");
    public static final FileTypeIcon NIX = create("nix", "nix");
    public static final FileTypeIcon NPMIGNORE = create("npmignore", "npmignore");
    public static final FileTypeIcon OCX = create("ocx", "ocx");
    public static final FileTypeIcon ODB = create("odb", "odb");
    public static final FileTypeIcon ODS = create("ods", "ods");
    public static final FileTypeIcon ODT = create("odt", "odt");
    public static final FileTypeIcon OGG = create("ogg", "ogg");
    public static final FileTypeIcon OGV = create("ogv", "ogv");
    public static final FileTypeIcon OST = create("ost", "ost");
    public static final FileTypeIcon OTF = create("otf", "otf");
    public static final FileTypeIcon OTT = create("ott", "ott");
    public static final FileTypeIcon OVA = create("ova", "ova");
    public static final FileTypeIcon OVF = create("ovf", "ovf");
    public static final FileTypeIcon P12 = create("p12", "p12");
    public static final FileTypeIcon P7B = create("p7b", "p7b");
    public static final FileTypeIcon PAGES = create("pages", "pages");
    public static final FileTypeIcon PART = create("part", "part");
    public static final FileTypeIcon PARTIAL = create("partial", "partial");
    public static final FileTypeIcon PCD = create("pcd", "pcd");
    public static final FileTypeIcon PDB = create("pdb", "pdb");
    public static final FileTypeIcon PDF = create("pdf", "pdf");
    public static final FileTypeIcon PEM = create("pem", "pem");
    public static final FileTypeIcon PFX = create("pfx", "pfx");
    public static final FileTypeIcon PGP = create("pgp", "pgp");
    public static final FileTypeIcon PH = create("ph", "ph");
    public static final FileTypeIcon PHAR = create("phar", "phar");
    public static final FileTypeIcon PHP = create("php", "php");
    public static final FileTypeIcon PID = create("pid", "pid");
    public static final FileTypeIcon PKG = create("pkg", "pkg");
    public static final FileTypeIcon PL = create("pl", "pl");
    public static final FileTypeIcon PLIST = create("plist", "plist");
    public static final FileTypeIcon PM = create("pm", "pm");
    public static final FileTypeIcon PNG = create("png", "png");
    public static final FileTypeIcon PO = create("po", "po");
    public static final FileTypeIcon POM = create("pom", "pom");
    public static final FileTypeIcon POT = create("pot", "pot");
    public static final FileTypeIcon POTX = create("potx", "potx");
    public static final FileTypeIcon PPS = create("pps", "pps");
    public static final FileTypeIcon PPSX = create("ppsx", "ppsx");
    public static final FileTypeIcon PPT = create("ppt", "ppt");
    public static final FileTypeIcon PPTM = create("pptm", "pptm");
    public static final FileTypeIcon PPTX = create("pptx", "pptx");
    public static final FileTypeIcon PROP = create("prop", "prop");
    public static final FileTypeIcon PS = create("ps", "ps");
    public static final FileTypeIcon PS1 = create("ps1", "ps1");
    public static final FileTypeIcon PSD = create("psd", "psd");
    public static final FileTypeIcon PSP = create("psp", "psp");
    public static final FileTypeIcon PST = create("pst", "pst");
    public static final FileTypeIcon PUB = create("pub", "pub");
    public static final FileTypeIcon PY = create("py", "py");
    public static final FileTypeIcon PYC = create("pyc", "pyc");
    public static final FileTypeIcon QT = create("qt", "qt");
    public static final FileTypeIcon RA = create("ra", "ra");
    public static final FileTypeIcon RAM = create("ram", "ram");
    public static final FileTypeIcon RAR = create("rar", "rar");
    public static final FileTypeIcon RAW = create("raw", "raw");
    public static final FileTypeIcon RB = create("rb", "rb");
    public static final FileTypeIcon RDF = create("rdf", "rdf");
    public static final FileTypeIcon RDL = create("rdl", "rdl");
    public static final FileTypeIcon REG = create("reg", "reg");
    public static final FileTypeIcon RESX = create("resx", "resx");
    public static final FileTypeIcon RETRY = create("retry", "retry");
    public static final FileTypeIcon RM = create("rm", "rm");
    public static final FileTypeIcon ROM = create("rom", "rom");
    public static final FileTypeIcon RPM = create("rpm", "rpm");
    public static final FileTypeIcon RPT = create("rpt", "rpt");
    public static final FileTypeIcon RSA = create("rsa", "rsa");
    public static final FileTypeIcon RSS = create("rss", "rss");
    public static final FileTypeIcon RST = create("rst", "rst");
    public static final FileTypeIcon RTF = create("rtf", "rtf");
    public static final FileTypeIcon RU = create("ru", "ru");
    public static final FileTypeIcon RUB = create("rub", "rub");
    public static final FileTypeIcon SASS = create("sass", "sass");
    public static final FileTypeIcon SCSS = create("scss", "scss");
    public static final FileTypeIcon SDF = create("sdf", "sdf");
    public static final FileTypeIcon SED = create("sed", "sed");
    public static final FileTypeIcon SH = create("sh", "sh");
    public static final FileTypeIcon SIT = create("sit", "sit");
    public static final FileTypeIcon SITEMAP = create("sitemap", "sitemap");
    public static final FileTypeIcon SKIN = create("skin", "skin");
    public static final FileTypeIcon SLDM = create("sldm", "sldm");
    public static final FileTypeIcon SLDX = create("sldx", "sldx");
    public static final FileTypeIcon SLN = create("sln", "sln");
    public static final FileTypeIcon SOL = create("sol", "sol");
    public static final FileTypeIcon SPHINX = create("sphinx", "sphinx");
    public static final FileTypeIcon SQL = create("sql", "sql");
    public static final FileTypeIcon SQLITE = create("sqlite", "sqlite");
    public static final FileTypeIcon STEP = create("step", "step");
    public static final FileTypeIcon STL = create("stl", "stl");
    public static final FileTypeIcon SVG = create("svg", "svg");
    public static final FileTypeIcon SWD = create("swd", "swd");
    public static final FileTypeIcon SWF = create("swf", "swf");
    public static final FileTypeIcon SWIFT = create("swift", "swift");
    public static final FileTypeIcon SWP = create("swp", "swp");
    public static final FileTypeIcon SYS = create("sys", "sys");
    public static final FileTypeIcon TAR = create("tar", "tar");
    public static final FileTypeIcon TAX = create("tax", "tax");
    public static final FileTypeIcon TCSH = create("tcsh", "tcsh");
    public static final FileTypeIcon TEX = create("tex", "tex");
    public static final FileTypeIcon TFIGNORE = create("tfignore", "tfignore");
    public static final FileTypeIcon TGA = create("tga", "tga");
    public static final FileTypeIcon TGZ = create("tgz", "tgz");
    public static final FileTypeIcon TIF = create("tif", "tif");
    public static final FileTypeIcon TIFF = create("tiff", "tiff");
    public static final FileTypeIcon TMP = create("tmp", "tmp");
    public static final FileTypeIcon TMX = create("tmx", "tmx");
    public static final FileTypeIcon TORRENT = create("torrent", "torrent");
    public static final FileTypeIcon TPL = create("tpl", "tpl");
    public static final FileTypeIcon TS = create("ts", "ts");
    public static final FileTypeIcon TSV = create("tsv", "tsv");
    public static final FileTypeIcon TTF = create("ttf", "ttf");
    public static final FileTypeIcon TWIG = create("twig", "twig");
    public static final FileTypeIcon TXT = create("txt", "txt");
    public static final FileTypeIcon UDF = create("udf", "udf");
    public static final FileTypeIcon VB = create("vb", "vb");
    public static final FileTypeIcon VBPROJ = create("vbproj", "vbproj");
    public static final FileTypeIcon VBS = create("vbs", "vbs");
    public static final FileTypeIcon VCD = create("vcd", "vcd");
    public static final FileTypeIcon VCF = create("vcf", "vcf");
    public static final FileTypeIcon VCS = create("vcs", "vcs");
    public static final FileTypeIcon VDI = create("vdi", "vdi");
    public static final FileTypeIcon VDX = create("vdx", "vdx");
    public static final FileTypeIcon VMDK = create("vmdk", "vmdk");
    public static final FileTypeIcon VOB = create("vob", "vob");
    public static final FileTypeIcon VOX = create("vox", "vox");
    public static final FileTypeIcon VSCODEIGNORE = create("vscodeignore", "vscodeignore");
    public static final FileTypeIcon VSD = create("vsd", "vsd");
    public static final FileTypeIcon VSS = create("vss", "vss");
    public static final FileTypeIcon VST = create("vst", "vst");
    public static final FileTypeIcon VSX = create("vsx", "vsx");
    public static final FileTypeIcon VTX = create("vtx", "vtx");
    public static final FileTypeIcon WAR = create("war", "war");
    public static final FileTypeIcon WAV = create("wav", "wav");
    public static final FileTypeIcon WBK = create("wbk", "wbk");
    public static final FileTypeIcon WEBINFO = create("webinfo", "webinfo");
    public static final FileTypeIcon WEBM = create("webm", "webm");
    public static final FileTypeIcon WEBP = create("webp", "webp");
    public static final FileTypeIcon WMA = create("wma", "wma");
    public static final FileTypeIcon WMF = create("wmf", "wmf");
    public static final FileTypeIcon WMV = create("wmv", "wmv");
    public static final FileTypeIcon WOFF = create("woff", "woff");
    public static final FileTypeIcon WOFF2 = create("woff2", "woff2");
    public static final FileTypeIcon WPS = create("wps", "wps");
    public static final FileTypeIcon WSF = create("wsf", "wsf");
    public static final FileTypeIcon XAML = create("xaml", "xaml");
    public static final FileTypeIcon XCF = create("xcf", "xcf");
    public static final FileTypeIcon XFL = create("xfl", "xfl");
    public static final FileTypeIcon XLM = create("xlm", "xlm");
    public static final FileTypeIcon XLS = create("xls", "xls");
    public static final FileTypeIcon XLSM = create("xlsm", "xlsm");
    public static final FileTypeIcon XLSX = create("xlsx", "xlsx");
    public static final FileTypeIcon XLT = create("xlt", "xlt");
    public static final FileTypeIcon XLTM = create("xltm", "xltm");
    public static final FileTypeIcon XLTX = create("xltx", "xltx");
    public static final FileTypeIcon XML = create("xml", "xml");
    public static final FileTypeIcon XPI = create("xpi", "xpi");
    public static final FileTypeIcon XPS = create("xps", "xps");
    public static final FileTypeIcon XRB = create("xrb", "xrb");
    public static final FileTypeIcon XSD = create("xsd", "xsd");
    public static final FileTypeIcon XSL = create("xsl", "xsl");
    public static final FileTypeIcon XSPF = create("xspf", "xspf");
    public static final FileTypeIcon XZ = create("xz", "xz");
    public static final FileTypeIcon YAML = create("yaml", "yaml");
    public static final FileTypeIcon YML = create("yml", "yml");
    public static final FileTypeIcon Z = create("z", "z");
    public static final FileTypeIcon ZIP = create("zip", "zip");
    public static final FileTypeIcon ZSH = create("zsh", "zsh");

}
