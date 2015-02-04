
PACKAGECONFIG[_defaultval] += "${@bb.utils.contains('DISTRO_FEATURES', 'xen', 'xen', '', d)}"
PACKAGECONFIG[xen] = "--enable-xen,--disable-xen,xen,xen-libxenstore xen-libxenctrl xen-libxenguest"

