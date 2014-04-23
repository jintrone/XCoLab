<div id="popup_login" class="popup-wrap small">
    <div class="popup">
        <h4>Log in to the Climate CoLab</h4>
        <div class="popup-message $loginMessageClass ">
            <p>This page requires you to log in using social media or your user name/password...</p>
        </div>
        <div class="loginwith">
            <a href="/web/guest/loginregister/-/login/SSO/facebookRegister" class="sketchy-icon-black facebook-sketchy" style="margin:0 30px 0 70px;"><span>Facebook</span></a>
            <a href="/web/guest/loginregister/-/login/SSO/googleRegister" class="sketchy-icon-black google-sketchy"><span>Google</span></a>
        </div>
        <div class="clearfix"></div>
           <div class="login_popup_box">
                <form id="signInForm_form" method="post" action="/web/guest/loginregister?p_p_id=loginregisterportlet_WAR_loginregisterportlet&p_p_lifecycle=1&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&saveLastPath=1&_loginregisterportlet_WAR_loginregisterportlet_isLoggingIn=true"
                        onsubmit="addRedirectBeforeSubmit('signInFormPopup'); return true;" >
                    <input type="hidden" name="isLoggingIn" value="true" />
                    <label>Username:</label> 
                    <input name="login" type="text" class="username" onkeypress="return submitenter(this,event)" style="float: right;"/>
                    <div class="clearfix"></div>
                    <label>Password:</label> &nbsp;
                    <input name="password" type="password" class="password" onkeypress="return submitenter(this,event)" style="float: right;"/>
                    <input name="redirect" type="hidden" value="<%= request.getParameter("redirect") %>"/>
                    <div class="btns">
                        <div style="float: left;">
                            <span><em><a href="javascript:;" class="forgot" style="color:#900;" onclick="showForgotPasswordPopup()">Forgot your password?</a></em></span><br />
                            <span><em><a href="/web/guest/loginregister?redirect=$escapeTool.url($themeDisplay.uRLCurrent)" class="forgot" >Haven't registered yet?</a></em></span><br />
                            <div class="clearfix"></div>
                        </div>
                        <div class="blue-button">
                            <a href="javascript:;" class="login-submit" onclick="jQuery(this).parents('form').submit();" id="deferLoginPopupSubmit">LOGIN</a>
                        </div>
                    </div>
                </form>
            </div>            
        </div>
</div>
<!-- /popup login -->



  
<div id="popup_forgotpassword" class="popup-wrap small" style="display: none;">
    <div class="popup">
        <div class="closepopuplogin"><a href="javascript:;" onclick="jQuery('#popup_forgotpassword').hide()"><img src="$images_folder/help_close.png" width="20" height="20" alt="X" /></a></div>
    
        <h4>Password recovery</h4>
        
        #if ($request.getParameter('isPasswordReminder')) 
        	#parse ("$full_templates_path/signin_reg_error_message_translator.vm")
        #else
        	<div class="popup-message"><p>Enter your email or screen name to get new password</p></div>
        #end            
        <div class="login_popup_box">
            <form id="forgotPasswordForm" method="post" action="/web/guest/loginregister?p_p_id=loginregisterportlet_WAR_loginregisterportlet&p_p_lifecycle=1&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&saveLastPath=1&_loginregisterportlet_WAR_loginregisterportlet_isForgotpass=true"
                    onsubmit="addRedirectBeforeSubmit('forgotPasswordForm'); processForgotPasswordForm('forgotPasswordForm');" >
                <label>Username/email:</label> 
                <input name="screenName" type="text" class="username screenName" placeholder="username/email" onkeypress="return submitenter(this,event)" />
                    
                <div class="btns">
                    <div class="blue-button">
                        <a href="javascript:;" onclick="jQuery(this).parents('form').submit(); " >Request new password</a>
                    </div>
                </div>
            </form>
        </div>
      </div>
    </div>
    <!-- /popup login -->