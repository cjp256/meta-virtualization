require xen.inc

SRCREV ?= "2b50cdbc444c637575580dcfa6c9525a84d5cc62"

XEN_GIT ?= "git://xenbits.xen.org/xen.git"
XEN_GIT_PROTOCOL ?= "git"
XEN_REL ?= "4.12"
XEN_BRANCH = "staging"
FLASK_POLICY_FILE = "xenpolicy-${XEN_REL}-unstable"

PV = "${XEN_REL}+git${SRCPV}"

S = "${WORKDIR}/git"

SRC_URI = " \
    git://${XEN_GIT};branch=${XEN_BRANCH};protocol=${XEN_GIT_PROTOCOL} \
    "

DEFAULT_PREFERENCE = "-1"
