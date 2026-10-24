package de.raindancer.modules.xaeromap;

import de.raindancer.core.ui.help.HelpLint;
import de.raindancer.modules.api.ModuleCommand;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

class GuideTest {

    @Test
    void theGuideIsComplete() {
        assertThat(HelpLint.of(Path.of("src/main/resources/rains-help"))
                .module("xaeromap")
                .settings(XaeroMapSettings.class, XaeroMapSettings.DEFAULTS)
                .commands(new XaeroMapModule().commands().stream().map(ModuleCommand::name).toList())
                .otherTopics("homes")
                .problems()).isEmpty();
    }
}
