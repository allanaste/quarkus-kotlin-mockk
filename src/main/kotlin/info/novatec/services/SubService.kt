package info.novatec.services

import javax.enterprise.context.ApplicationScoped

/**
 * Exemplary Quarkus CDI bean.
 *
 * @author Christian Schwörer
 * @see <a href="https://www.novatec-gmbh.de/blog/">Associated Blog Post</a>
 */
@ApplicationScoped
class SubService {
    fun sayHello() = "Hello from the REAL SubService"
}
