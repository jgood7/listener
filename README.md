# Listener - Customizable Notification Handler
### Android application that listens for notifications and provides customizable reactions

#### Main Page Contents:
   <ul>
   <li>Enabled</li>
        <ul>
            <li> A toggle button to quickly activate/deactivate the app functionality</li>
        </ul>
    <li>Configured Apps</li>
        <ul>
            <li> Leads to a new fragment displaying all apps which have been activated in any level</li>
            <li>Contains these elements:</li>
                <ol>
                    <li>Add/Remove Apps</li>
                    - Choose which apps are affected. Each contains a checkbox to toggle on/off
                    <li>Modify Behavior</li>
                    - Views affected apps. Rules can be set here <br>
                    - Each app then has its own submenu containing these two options:
                        <ol>
                            <li>Base Case</li>
                            - Standard functionality for this app
                            <li>Unique Cases</li>
                            - Customizable options, such as different reactions for text matches
                                in a response <br>
                            - This could include different sounds or TTS replies, or different depth
                                such as subcontent being read
                        </ol>
                </ol>
        </ul>
   <li>Settings</li>
        <ul>
        <li>Contains general adjustments to functionality such as:</li>
            - Audio channel to direct to <br>
            - Criteria to function (headphones, screen state, etc)
        </ul>
   </ul>


#### Cases
Cases are the foundation of the app. These govern reactions. They are split into three types:
<ul>
    <li>Base Case</li>
        - One base case exists which applies to all events. This acts as a default.
    <li>App Case</li>
        - Each app can have one app case which overrides the default. This is useful for having messaging apps read more content or playing a different sound than a social media notification, for example.
    <li>Unique Cases</li>
        - This shines in messaging apps where the user can pick custom responses for different sender names or other content. <br><i>- Many of these can exist in a single app.</i>
</ul>
