/**
 * Checks if the receiver is `null` and if so, executes the `block`, forcing an early exit.
 *
 * @param block A block that is called if the receiver is null.
 *
 * @return The receiver, now guaranteed to not be null.
 */
inline fun <T> T?.guard(block: () -> Nothing): T {
    return this ?: block()
}