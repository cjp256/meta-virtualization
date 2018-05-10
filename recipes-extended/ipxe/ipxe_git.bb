DESCRIPTION = "Open source network boot firmware"
HOMEPAGE = "http://ipxe.org"
LICENSE = "GPLv2"
DEPENDS = "binutils-native perl-native syslinux mtools-native cdrtools-native"
LIC_FILES_CHKSUM = "file://../COPYING.GPLv2;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRCREV = "960d1e36b09803b291803ab336412f7d95349568"
PV = "gitr${SRCPV}"
PR = "r0"

SRC_URI = "git://git.ipxe.org/ipxe.git;protocol=https \
           file://cross-conf.patch;striplevel=2 \
"

FILES_${PN} = "/usr/share/firmware/*.rom"

EXTRA_OEMAKE = "NO_WERROR=1 ISOLINUX_BIN="${STAGING_DIR_TARGET}/usr/lib/syslinux/isolinux.bin""

S = "${WORKDIR}/git/src"

do_compile() {
   oe_runmake
}

do_install() {
    install -d ${D}/usr/share/firmware
    install ${S}/bin/*.rom ${D}/usr/share/firmware/
}
