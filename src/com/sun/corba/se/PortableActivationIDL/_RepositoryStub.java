package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/_RepositoryStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/jenkins/workspace/build-scripts/jobs/jdk8u/jdk8u-mac-x64-hotspot/workspace/build/src/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* 22 April 2020 09:48:47 o'clock IST
*/

public class _RepositoryStub extends org.omg.CORBA.portable.ObjectImpl implements com.sun.corba.se.PortableActivationIDL.Repository
{


  /** register server definition.
  	* This returns the serverId of the server.  A newly created server is
  	* always uninstalled.
  	*/
  public String registerServer (com.sun.corba.se.PortableActivationIDL.RepositoryPackage.ServerDef serverDef) throws com.sun.corba.se.PortableActivationIDL.ServerAlreadyRegistered, com.sun.corba.se.PortableActivationIDL.BadServerDefinition
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("registerServer", true);
                com.sun.corba.se.PortableActivationIDL.RepositoryPackage.ServerDefHelper.write ($out, serverDef);
                $in = _invoke ($out);
                String $result = org.omg.PortableInterceptor.ServerIdHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:PortableActivationIDL/ServerAlreadyRegistered:1.0"))
                    throw com.sun.corba.se.PortableActivationIDL.ServerAlreadyRegisteredHelper.read ($in);
                else if (_id.equals ("IDL:PortableActivationIDL/BadServerDefinition:1.0"))
                    throw com.sun.corba.se.PortableActivationIDL.BadServerDefinitionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return registerServer (serverDef        );
            } finally {
                _releaseReply ($in);
            }
  } // registerServer


  /** unregister server definition
  	*/
  public void unregisterServer (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("unregisterServer", true);
                org.omg.PortableInterceptor.ServerIdHelper.write ($out, serverId);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:PortableActivationIDL/ServerNotRegistered:1.0"))
                    throw com.sun.corba.se.PortableActivationIDL.ServerNotRegisteredHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                unregisterServer (serverId        );
            } finally {
                _releaseReply ($in);
            }
  } // unregisterServer


  /** get server definition
  	*/
  public com.sun.corba.se.PortableActivationIDL.RepositoryPackage.ServerDef getServer (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getServer", true);
                org.omg.PortableInterceptor.ServerIdHelper.write ($out, serverId);
                $in = _invoke ($out);
                com.sun.corba.se.PortableActivationIDL.RepositoryPackage.ServerDef $result = com.sun.corba.se.PortableActivationIDL.RepositoryPackage.ServerDefHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:PortableActivationIDL/ServerNotRegistered:1.0"))
                    throw com.sun.corba.se.PortableActivationIDL.ServerNotRegisteredHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getServer (serverId        );
            } finally {
                _releaseReply ($in);
            }
  } // getServer


  /** Return whether the server has been installed
  	*/
  public boolean isInstalled (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("isInstalled", true);
                org.omg.PortableInterceptor.ServerIdHelper.write ($out, serverId);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:PortableActivationIDL/ServerNotRegistered:1.0"))
                    throw com.sun.corba.se.PortableActivationIDL.ServerNotRegisteredHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return isInstalled (serverId        );
            } finally {
                _releaseReply ($in);
            }
  } // isInstalled


  /** Mark the server as being installed.  Raises ServerAlreadyInstalled
  	* if the server is currently marked as installed.
  	*/
  public void install (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered, com.sun.corba.se.PortableActivationIDL.ServerAlreadyInstalled
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("install", true);
                org.omg.PortableInterceptor.ServerIdHelper.write ($out, serverId);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:PortableActivationIDL/ServerNotRegistered:1.0"))
                    throw com.sun.corba.se.PortableActivationIDL.ServerNotRegisteredHelper.read ($in);
                else if (_id.equals ("IDL:PortableActivationIDL/ServerAlreadyInstalled:1.0"))
                    throw com.sun.corba.se.PortableActivationIDL.ServerAlreadyInstalledHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                install (serverId        );
            } finally {
                _releaseReply ($in);
            }
  } // install


  /** Mark the server as being uninstalled.  Raises ServerAlreadyUninstalled
  	* if the server is currently marked as uninstalled.
  	*/
  public void uninstall (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered, com.sun.corba.se.PortableActivationIDL.ServerAlreadyUninstalled
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("uninstall", true);
                org.omg.PortableInterceptor.ServerIdHelper.write ($out, serverId);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:PortableActivationIDL/ServerNotRegistered:1.0"))
                    throw com.sun.corba.se.PortableActivationIDL.ServerNotRegisteredHelper.read ($in);
                else if (_id.equals ("IDL:PortableActivationIDL/ServerAlreadyUninstalled:1.0"))
                    throw com.sun.corba.se.PortableActivationIDL.ServerAlreadyUninstalledHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                uninstall (serverId        );
            } finally {
                _releaseReply ($in);
            }
  } // uninstall


  /** list registered servers
  	*/
  public String[] listRegisteredServers ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("listRegisteredServers", true);
                $in = _invoke ($out);
                String $result[] = com.sun.corba.se.PortableActivationIDL.ServerIdsHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return listRegisteredServers (        );
            } finally {
                _releaseReply ($in);
            }
  } // listRegisteredServers


  /** Returns list of ALL applicationNames defined in ServerDefs of registered 
  	* servers.
  	*/
  public String[] getApplicationNames ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getApplicationNames", true);
                $in = _invoke ($out);
                String $result[] = com.sun.corba.se.PortableActivationIDL.RepositoryPackage.AppNamesHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getApplicationNames (        );
            } finally {
                _releaseReply ($in);
            }
  } // getApplicationNames


  /** Find the ServerID associated with the given application name.
  	*/
  public String getServerID (String applicationName) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getServerID", true);
                $out.write_string (applicationName);
                $in = _invoke ($out);
                String $result = org.omg.PortableInterceptor.ServerIdHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:PortableActivationIDL/ServerNotRegistered:1.0"))
                    throw com.sun.corba.se.PortableActivationIDL.ServerNotRegisteredHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getServerID (applicationName        );
            } finally {
                _releaseReply ($in);
            }
  } // getServerID

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:PortableActivationIDL/Repository:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _RepositoryStub
