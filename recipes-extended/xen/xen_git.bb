require xen.inc

SRCREV = "1fd615aa0108490ffc558d27627f509183cbfdaf"

XEN_REL="4.7"

PV = "${XEN_REL}.0+git${SRCPV}"

S = "${WORKDIR}/git"

XEN_BRANCH ?= "staging-${XEN_REL}"

SRC_URI = " \
    git://xenbits.xen.org/xen.git;branch=${XEN_BRANCH} \
    "

DEFAULT_PREFERENCE = "-1"
