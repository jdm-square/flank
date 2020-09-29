package flank.scripts.testartifacts.core

import com.jcabi.github.Repo
import flank.scripts.github.githubRepo
import flank.scripts.utils.getEnv

internal fun testArtifactsRepo(): Repo = githubRepo(getEnv(GITHUB_TOKEN), TEST_ARTIFACTS_REPO)
