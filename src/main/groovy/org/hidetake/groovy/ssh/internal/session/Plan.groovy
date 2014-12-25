package org.hidetake.groovy.ssh.internal.session

import groovy.transform.Canonical
import org.hidetake.groovy.ssh.api.Remote

@Canonical
class Plan<T> {
    final Remote remote
    final Closure<T> closure
}
